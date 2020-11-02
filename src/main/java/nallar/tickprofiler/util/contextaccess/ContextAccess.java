package nallar.tickprofiler.util.contextaccess;

public interface ContextAccess {

	ContextAccess CONTEXT_ACCESS = ContextAccessProvider.getContextAccess();
	Class getContext(int depth);

}
