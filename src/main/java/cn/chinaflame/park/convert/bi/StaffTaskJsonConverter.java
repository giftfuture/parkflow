package cn.chinaflame.park.convert.bi;

import java.util.Map;

import org.activiti.bpmn.model.BaseElement;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.FlowElementsContainer;
import org.activiti.bpmn.model.UserTask;
import org.activiti.editor.language.json.converter.ActivityProcessor;
import org.activiti.editor.language.json.converter.UserTaskJsonConverter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class StaffTaskJsonConverter extends UserTaskJsonConverter {
	public void convertToJson(BaseElement baseElement,
			ActivityProcessor processor, BpmnModel model,
			FlowElementsContainer container, ArrayNode shapesArrayNode,
			double subProcessX, double subProcessY) {
		super.convertToJson(baseElement, processor, model, container,
				shapesArrayNode, subProcessX, subProcessY);
	}
	/**
	 * 解析自定义的扩展属性信息
	 */
	@Override
	protected FlowElement convertJsonToElement(JsonNode elementNode,JsonNode modelNode, Map shapeMap) {
		FlowElement flowElement = super.convertJsonToElement(elementNode,
				modelNode, shapeMap);
		//.....//书写解析属性的业务逻辑即可
		//ShareniuXML.writeXML(flowElement ,elementNode);
		return flowElement;

	}
	/*public static void fillTypes(Map convertersToBpmnMap,Map<Class, Class> convertersToJsonMap) {
		fillJsonTypes(convertersToBpmnMap);
		fillBpmnTypes(convertersToJsonMap);
	}*/
	public static void fillJsonTypes(Map convertersToBpmnMap) {
		convertersToBpmnMap.put(STENCIL_TASK_USER,
				StaffTaskJsonConverter.class);
	}

	/*public static void fillBpmnTypes(Map<Class, Class> convertersToJsonMap) {
		convertersToJsonMap.put(UserTask.class, StaffTaskJsonConverter.class);
	}*/
}
