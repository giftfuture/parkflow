package cn.chinaflame.park.shiro;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.chinaflame.park.collect.Mapx;
import cn.chinaflame.park.convert.ConvertUtil;
import cn.chinaflame.park.model.PaStaff;
import cn.chinaflame.park.service.PaStaffService;
import cn.chinaflame.park.service.PaSysRoleService;
import cn.chinaflame.park.vo.PaStaffVO;

/**
 * Shiro的认证和授权
 * Shiro登录认证(原理：用户提交 用户名和密码  --- 
 * 		shiro 封装令牌 ---- 
 * 		realm 通过用户名将密码查询返回 ---- 
 * 		shiro 自动去比较查询出密码和用户输入密码是否一致----
 * 		进行登陆控制 )
 */
public class UserRealm extends AuthorizingRealm{
	protected Log logger = LogFactory.getLog(UserRealm.class);

    @Autowired private PaStaffService pastaffService;
    @Autowired private PaSysRoleService pasysroleservice;
    
    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        PaStaffVO uservo = new PaStaffVO();
        uservo.setLoginname(token.getUsername());
        Mapx mapx = ConvertUtil.toMap(uservo);
        List<PaStaffVO> list = pastaffService.staffLogin(mapx.toMap());
        // 账号不存在
        if (list == null || list.isEmpty()) {
            return null;
        }
        PaStaffVO user = list.get(0);
        // 读取用户的url和角色
//        Map<String, Set<String>> resourceMap = pasysroleservice..selectResourceMapByUserId(user.getId());
//        Set<String> urls = resourceMap.get("urls");
//        Set<String> roles = resourceMap.get("roles");
//        ShiroUser shiroUser = new ShiroUser(user.getId(), user.getLoginName(), user.getUserName(), urls);
//        shiroUser.setRoles(roles);
        // 认证缓存信息
       // return new SimpleAuthenticationInfo(shiroUser, user.getLoginPwd().toCharArray(), "salt");
        return null;
    }

    /**
     * Shiro权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(shiroUser.getRoles());
        info.addStringPermissions(shiroUser.getUrlSet());
        
        return info;
    }
    
    @Override
    public void onLogout(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        removeUserCache(shiroUser);
    }

    /**
     * 清除用户缓存
     * @param shiroUser
     */
    public void removeUserCache(ShiroUser shiroUser){
        removeUserCache(shiroUser.getLoginName());
    }

    /**
     * 清除用户缓存
     * @param loginName
     */
    public void removeUserCache(String loginName){
        SimplePrincipalCollection principals = new SimplePrincipalCollection();
        principals.add(loginName, super.getName());
        super.clearCachedAuthenticationInfo(principals);
    }
}
