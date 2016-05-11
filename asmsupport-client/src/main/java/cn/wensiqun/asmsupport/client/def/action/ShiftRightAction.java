package cn.wensiqun.asmsupport.client.def.action;

import cn.wensiqun.asmsupport.client.def.Param;
import cn.wensiqun.asmsupport.client.def.ParamPostern;
import cn.wensiqun.asmsupport.client.def.param.DummyParam;
import cn.wensiqun.asmsupport.core.operator.Operator;
import cn.wensiqun.asmsupport.core.utils.common.BlockTracker;

public class ShiftRightAction extends AbstractBinaryAction {

    public ShiftRightAction(BlockTracker tracker) {
        super(tracker, Operator.SHIFT_RIGHT);
    }

    @Override
    public Param doAction(Param... operands) {
        return new DummyParam(tracker, tracker.track().shr(ParamPostern.getTarget(operands[0]),
                ParamPostern.getTarget(operands[1])));
    }

}
