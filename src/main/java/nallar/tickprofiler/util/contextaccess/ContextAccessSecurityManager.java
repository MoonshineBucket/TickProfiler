package nallar.tickprofiler.util.contextaccess;

public class ContextAccessSecurityManager extends SecurityManager implements ContextAccess {
	@Override
	public Class getContext(int depth) {
		return getClassContext()[depth + 1];
	}
}
