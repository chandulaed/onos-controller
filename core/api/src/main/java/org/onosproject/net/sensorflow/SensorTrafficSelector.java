package org.onosproject.net.sensorflow;

import org.onosproject.net.flow.TrafficSelector;
import org.onosproject.net.sensor.SensorNodeAddress;
import org.onosproject.net.sensorflow.SensorFlowCriterion.SensorNodeCriterionMatchType;
import org.onosproject.net.sensorflow.SensorFlowCriterion.SensorNodeFields;

import static org.onosproject.net.sensorpacket.SensorPacketTypeRegistry.SensorPacketType;

/**
 * Created by aca on 3/2/15.
 */
public interface SensorTrafficSelector extends TrafficSelector {
    public SensorFlowCriterion getSdnWiseCriterion(SensorFlowCriterion.SensorFlowCriterionType type);

    interface Builder extends TrafficSelector.Builder {
        Builder add(SensorFlowCriterion sensorFlowCriterion);

        Builder matchPacketFields(SensorNodeFields field1, SensorNodeFields field2);

        Builder matchPacketFields(SensorNodeFields field1, SensorNodeFields field2,
                                                         SensorNodeCriterionMatchType matchType);

        Builder matchPacketFields(int pos1, int pos2,
                                                        SensorNodeCriterionMatchType matchType);

        Builder matchPacketFieldWithConst(int packetPos, int value, int offset,
                                                        SensorNodeCriterionMatchType matchType);

        Builder matchStateConst(int beginPos, int endPos, int value,
                                                      SensorNodeCriterionMatchType matchType);

        Builder matchStateState(int operand1Pos, int operand2Pos, int offset,
                                                      SensorNodeCriterionMatchType matchType);

        Builder matchNodeSrcAddr(SensorNodeAddress addr);

        Builder matchNodeSrcAddr(SensorNodeAddress addr,
                                                        SensorNodeCriterionMatchType matchType);

        Builder matchNodeDstAddr(SensorNodeAddress addr);

        Builder matchNodeDstAddr(SensorNodeAddress addr,
                                                        SensorNodeCriterionMatchType matchType);

        Builder matchSensorPacketType(SensorPacketType packetType);

        Builder matchSensorPacketType(SensorNodeCriterionMatchType matchType,
                                                            SensorPacketType packetType);

        Builder matchSensorNodeMutlicastPrevHop(SensorNodeAddress prevNode);

        Builder matchSensorNodeMutlicastPrevHop(SensorNodeAddress prevNode,
                                                                       SensorNodeCriterionMatchType matchType);

        Builder matchSensorNodeMutlicastCurHop(SensorNodeAddress curNode);

        Builder matchSensorNodeMutlicastCurHop(SensorNodeAddress curNode,
                                                                      SensorNodeCriterionMatchType matchType);
    }
}
