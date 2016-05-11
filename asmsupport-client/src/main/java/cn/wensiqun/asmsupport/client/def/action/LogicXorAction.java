package cn.wensiqun.asmsupport.client.def.action;

import cn.wensiqun.asmsupport.client.def.Param;
import cn.wensiqun.asmsupport.client.def.ParamPostern;
import cn.wensiqun.asmsupport.client.def.param.DummyParam;
import cn.wensiqun.asmsupport.core.operator.Operator;
import cn.wensiqun.asmsupport.core.utils.common.BlockTracker;

public class LogicXorAction extends AbstractBinaryAction {

    public LogicXorAction(BlockTracker tracker) {
        super(tracker, Operator.XOR);
    }

    @Override
    public Param doAction(Param... operands) {
        return new DummyParam(tracker, tracker.track().logicalXor(ParamPostern.getTarget(operands[0]),
                ParamPostern.getTarget(operands[1])));
    }

}
