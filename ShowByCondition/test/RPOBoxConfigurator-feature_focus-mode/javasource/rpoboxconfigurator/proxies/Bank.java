// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rpoboxconfigurator.proxies;

public class Bank
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bankMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RPOBoxConfigurator.Bank";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		Bank_Wall("RPOBoxConfigurator.Bank_Wall");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Bank(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RPOBoxConfigurator.Bank"));
	}

	protected Bank(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bankMendixObject)
	{
		if (bankMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RPOBoxConfigurator.Bank", bankMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RPOBoxConfigurator.Bank");

		this.bankMendixObject = bankMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Bank.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static rpoboxconfigurator.proxies.Bank initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rpoboxconfigurator.proxies.Bank.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static rpoboxconfigurator.proxies.Bank initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rpoboxconfigurator.proxies.Bank(context, mendixObject);
	}

	public static rpoboxconfigurator.proxies.Bank load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rpoboxconfigurator.proxies.Bank.initialize(context, mendixObject);
	}

	public static java.util.List<rpoboxconfigurator.proxies.Bank> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<rpoboxconfigurator.proxies.Bank> result = new java.util.ArrayList<rpoboxconfigurator.proxies.Bank>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RPOBoxConfigurator.Bank" + xpathConstraint))
			result.add(rpoboxconfigurator.proxies.Bank.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Integer sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of Bank_Wall
	 */
	public final rpoboxconfigurator.proxies.Wall getBank_Wall() throws com.mendix.core.CoreException
	{
		return getBank_Wall(getContext());
	}

	/**
	 * @param context
	 * @return value of Bank_Wall
	 */
	public final rpoboxconfigurator.proxies.Wall getBank_Wall(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		rpoboxconfigurator.proxies.Wall result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Bank_Wall.toString());
		if (identifier != null)
			result = rpoboxconfigurator.proxies.Wall.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Bank_Wall
	 * @param bank_wall
	 */
	public final void setBank_Wall(rpoboxconfigurator.proxies.Wall bank_wall)
	{
		setBank_Wall(getContext(), bank_wall);
	}

	/**
	 * Set value of Bank_Wall
	 * @param context
	 * @param bank_wall
	 */
	public final void setBank_Wall(com.mendix.systemwideinterfaces.core.IContext context, rpoboxconfigurator.proxies.Wall bank_wall)
	{
		if (bank_wall == null)
			getMendixObject().setValue(context, MemberNames.Bank_Wall.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Bank_Wall.toString(), bank_wall.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bankMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final rpoboxconfigurator.proxies.Bank that = (rpoboxconfigurator.proxies.Bank) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "RPOBoxConfigurator.Bank";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
