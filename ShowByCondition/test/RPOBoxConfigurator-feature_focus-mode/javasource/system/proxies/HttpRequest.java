// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class HttpRequest extends system.proxies.HttpMessage
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.HttpRequest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Uri("Uri"),
		HttpVersion("HttpVersion"),
		Content("Content");

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

	public HttpRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.HttpRequest"));
	}

	protected HttpRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject httpRequestMendixObject)
	{
		super(context, httpRequestMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("System.HttpRequest", httpRequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.HttpRequest");
	}

	/**
	 * @deprecated Use 'HttpRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.HttpRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.HttpRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.HttpRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.HttpRequest(context, mendixObject);
	}

	public static system.proxies.HttpRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.HttpRequest.initialize(context, mendixObject);
	}

	/**
	 * @return value of Uri
	 */
	public final java.lang.String getUri()
	{
		return getUri(getContext());
	}

	/**
	 * @param context
	 * @return value of Uri
	 */
	public final java.lang.String getUri(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Uri.toString());
	}

	/**
	 * Set value of Uri
	 * @param uri
	 */
	public final void setUri(java.lang.String uri)
	{
		setUri(getContext(), uri);
	}

	/**
	 * Set value of Uri
	 * @param context
	 * @param uri
	 */
	public final void setUri(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uri)
	{
		getMendixObject().setValue(context, MemberNames.Uri.toString(), uri);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.HttpRequest that = (system.proxies.HttpRequest) obj;
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
		return "System.HttpRequest";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
