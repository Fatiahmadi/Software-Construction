package q.aTree.expr.comparison;

import q.aTree.expr.AExpression;
import q.aTree.expr.ABinary;
import q.aTree.expr.ExpressionVisitor;
import q.aTree.type.BooleanT;

public class LessThan extends ABinary {

	public LessThan(AExpression leftHandExpr, AExpression rightHandExpr) {
		super(leftHandExpr, rightHandExpr);
	}

	@Override
	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return this.getLeftHandExpr().toString() + " < "
				+ this.getRightHandExpr().toString();
	}

	@Override
	public BooleanT getType() {
		return new BooleanT();
	}
}
