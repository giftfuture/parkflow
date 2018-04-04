package cn.chinaflame.park.json.databind;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import cn.chinaflame.park.collect.Mapx;

/**
 * _Mapx反序列化
 */

public class MapxDeserializer extends JsonDeserializer<Mapx> {

	@Override
	public Mapx deserialize(JsonParser parser, DeserializationContext context) throws IOException,
			JsonProcessingException {
		try {
			TreeNode node = parser.readValueAsTree();
			return TreeNodeConverts.toMapx(node);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
