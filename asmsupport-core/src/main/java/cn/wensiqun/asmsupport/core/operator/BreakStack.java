/**    
 *  Asmsupport is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.wensiqun.asmsupport.core.operator;

import cn.wensiqun.asmsupport.core.context.MethodExecuteContext;
import cn.wensiqun.asmsupport.core.block.KernelProgramBlock;

public abstract class BreakStack extends AbstractOperator {

    /*
     * if exists, this label indicate start position of auto create finally block, 
     * otherwise, indicate the current operator label. 
     */
	private boolean autoCreate;

	protected BreakStack(KernelProgramBlock block, boolean autoCreate) {
		super(block, Operator.COMMON);
		this.autoCreate = autoCreate;
	}

    @Override
	protected void startingPrepare() {
		getParent().setFinish(true);
	}

	public boolean isAutoCreate() {
		return autoCreate;
	}

    @Override
	protected final void doExecute(MethodExecuteContext context) {
	    breakStackExecuting(context);
	}
	
    protected abstract void breakStackExecuting(MethodExecuteContext context);

}
