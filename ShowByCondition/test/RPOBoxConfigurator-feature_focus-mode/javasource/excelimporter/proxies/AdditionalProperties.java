// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

/**
 * Besides the basic settings in the Template this entity contains all advanced settings.
 * 
 * This entity can not exist without a template
 */
public class AdditionalProperties
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject additionalPropertiesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ExcelImporter.AdditionalProperties";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PrintStatisticsMessages("PrintStatisticsMessages"),
		PrintNotFoundMessages_MainObject("PrintNotFoundMessages_MainObject"),
		IgnoreEmptyKeys("IgnoreEmptyKeys"),
		CommitUnchangedObjects_MainObject("CommitUnchangedObjects_MainObject"),
		RemoveUnsyncedObjects("RemoveUnsyncedObjects"),
		ResetEmptyAssociations("ResetEmptyAssociations"),
		Template_AdditionalProperties("ExcelImporter.Template_AdditionalProperties"),
		AdditionalProperties_MxObjectMember_RemoveIndicator("ExcelImporter.AdditionalProperties_MxObjectMember_RemoveIndicator");

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

	public AdditionalProperties(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ExcelImporter.AdditionalProperties"));
	}

	protected AdditionalProperties(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject additionalPropertiesMendixObject)
	{
		if (additionalPropertiesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ExcelImporter.AdditionalProperties", additionalPropertiesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ExcelImporter.AdditionalProperties");

		this.additionalPropertiesMendixObject = additionalPropertiesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AdditionalProperties.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static excelimporter.proxies.AdditionalProperties initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return excelimporter.proxies.AdditionalProperties.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static excelimporter.proxies.AdditionalProperties initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new excelimporter.proxies.AdditionalProperties(context, mendixObject);
	}

	public static excelimporter.proxies.AdditionalProperties load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return excelimporter.proxies.AdditionalProperties.initialize(context, mendixObject);
	}

	public static java.util.List<excelimporter.proxies.AdditionalProperties> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<excelimporter.proxies.AdditionalProperties> result = new java.util.ArrayList<excelimporter.proxies.AdditionalProperties>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ExcelImporter.AdditionalProperties" + xpathConstraint))
			result.add(excelimporter.proxies.AdditionalProperties.initialize(context, obj));
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
	 * Set value of PrintStatisticsMessages
	 * @param printstatisticsmessages
	 */
	public final excelimporter.proxies.StatisticsLevel getPrintStatisticsMessages()
	{
		return getPrintStatisticsMessages(getContext());
	}

	/**
	 * @param context
	 * @return value of PrintStatisticsMessages
	 */
	public final excelimporter.proxies.StatisticsLevel getPrintStatisticsMessages(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PrintStatisticsMessages.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.StatisticsLevel.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PrintStatisticsMessages
	 * @param printstatisticsmessages
	 */
	public final void setPrintStatisticsMessages(excelimporter.proxies.StatisticsLevel printstatisticsmessages)
	{
		setPrintStatisticsMessages(getContext(), printstatisticsmessages);
	}

	/**
	 * Set value of PrintStatisticsMessages
	 * @param context
	 * @param printstatisticsmessages
	 */
	public final void setPrintStatisticsMessages(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.StatisticsLevel printstatisticsmessages)
	{
		if (printstatisticsmessages != null)
			getMendixObject().setValue(context, MemberNames.PrintStatisticsMessages.toString(), printstatisticsmessages.toString());
		else
			getMendixObject().setValue(context, MemberNames.PrintStatisticsMessages.toString(), null);
	}

	/**
	 * @return value of PrintNotFoundMessages_MainObject
	 */
	public final java.lang.Boolean getPrintNotFoundMessages_MainObject()
	{
		return getPrintNotFoundMessages_MainObject(getContext());
	}

	/**
	 * @param context
	 * @return value of PrintNotFoundMessages_MainObject
	 */
	public final java.lang.Boolean getPrintNotFoundMessages_MainObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.PrintNotFoundMessages_MainObject.toString());
	}

	/**
	 * Set value of PrintNotFoundMessages_MainObject
	 * @param printnotfoundmessages_mainobject
	 */
	public final void setPrintNotFoundMessages_MainObject(java.lang.Boolean printnotfoundmessages_mainobject)
	{
		setPrintNotFoundMessages_MainObject(getContext(), printnotfoundmessages_mainobject);
	}

	/**
	 * Set value of PrintNotFoundMessages_MainObject
	 * @param context
	 * @param printnotfoundmessages_mainobject
	 */
	public final void setPrintNotFoundMessages_MainObject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean printnotfoundmessages_mainobject)
	{
		getMendixObject().setValue(context, MemberNames.PrintNotFoundMessages_MainObject.toString(), printnotfoundmessages_mainobject);
	}

	/**
	 * @return value of IgnoreEmptyKeys
	 */
	public final java.lang.Boolean getIgnoreEmptyKeys()
	{
		return getIgnoreEmptyKeys(getContext());
	}

	/**
	 * @param context
	 * @return value of IgnoreEmptyKeys
	 */
	public final java.lang.Boolean getIgnoreEmptyKeys(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IgnoreEmptyKeys.toString());
	}

	/**
	 * Set value of IgnoreEmptyKeys
	 * @param ignoreemptykeys
	 */
	public final void setIgnoreEmptyKeys(java.lang.Boolean ignoreemptykeys)
	{
		setIgnoreEmptyKeys(getContext(), ignoreemptykeys);
	}

	/**
	 * Set value of IgnoreEmptyKeys
	 * @param context
	 * @param ignoreemptykeys
	 */
	public final void setIgnoreEmptyKeys(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ignoreemptykeys)
	{
		getMendixObject().setValue(context, MemberNames.IgnoreEmptyKeys.toString(), ignoreemptykeys);
	}

	/**
	 * @return value of CommitUnchangedObjects_MainObject
	 */
	public final java.lang.Boolean getCommitUnchangedObjects_MainObject()
	{
		return getCommitUnchangedObjects_MainObject(getContext());
	}

	/**
	 * @param context
	 * @return value of CommitUnchangedObjects_MainObject
	 */
	public final java.lang.Boolean getCommitUnchangedObjects_MainObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CommitUnchangedObjects_MainObject.toString());
	}

	/**
	 * Set value of CommitUnchangedObjects_MainObject
	 * @param commitunchangedobjects_mainobject
	 */
	public final void setCommitUnchangedObjects_MainObject(java.lang.Boolean commitunchangedobjects_mainobject)
	{
		setCommitUnchangedObjects_MainObject(getContext(), commitunchangedobjects_mainobject);
	}

	/**
	 * Set value of CommitUnchangedObjects_MainObject
	 * @param context
	 * @param commitunchangedobjects_mainobject
	 */
	public final void setCommitUnchangedObjects_MainObject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean commitunchangedobjects_mainobject)
	{
		getMendixObject().setValue(context, MemberNames.CommitUnchangedObjects_MainObject.toString(), commitunchangedobjects_mainobject);
	}

	/**
	 * Set value of RemoveUnsyncedObjects
	 * @param removeunsyncedobjects
	 */
	public final excelimporter.proxies.RemoveIndicator getRemoveUnsyncedObjects()
	{
		return getRemoveUnsyncedObjects(getContext());
	}

	/**
	 * @param context
	 * @return value of RemoveUnsyncedObjects
	 */
	public final excelimporter.proxies.RemoveIndicator getRemoveUnsyncedObjects(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RemoveUnsyncedObjects.toString());
		if (obj == null)
			return null;

		return excelimporter.proxies.RemoveIndicator.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RemoveUnsyncedObjects
	 * @param removeunsyncedobjects
	 */
	public final void setRemoveUnsyncedObjects(excelimporter.proxies.RemoveIndicator removeunsyncedobjects)
	{
		setRemoveUnsyncedObjects(getContext(), removeunsyncedobjects);
	}

	/**
	 * Set value of RemoveUnsyncedObjects
	 * @param context
	 * @param removeunsyncedobjects
	 */
	public final void setRemoveUnsyncedObjects(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.RemoveIndicator removeunsyncedobjects)
	{
		if (removeunsyncedobjects != null)
			getMendixObject().setValue(context, MemberNames.RemoveUnsyncedObjects.toString(), removeunsyncedobjects.toString());
		else
			getMendixObject().setValue(context, MemberNames.RemoveUnsyncedObjects.toString(), null);
	}

	/**
	 * @return value of ResetEmptyAssociations
	 */
	public final java.lang.Boolean getResetEmptyAssociations()
	{
		return getResetEmptyAssociations(getContext());
	}

	/**
	 * @param context
	 * @return value of ResetEmptyAssociations
	 */
	public final java.lang.Boolean getResetEmptyAssociations(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ResetEmptyAssociations.toString());
	}

	/**
	 * Set value of ResetEmptyAssociations
	 * @param resetemptyassociations
	 */
	public final void setResetEmptyAssociations(java.lang.Boolean resetemptyassociations)
	{
		setResetEmptyAssociations(getContext(), resetemptyassociations);
	}

	/**
	 * Set value of ResetEmptyAssociations
	 * @param context
	 * @param resetemptyassociations
	 */
	public final void setResetEmptyAssociations(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean resetemptyassociations)
	{
		getMendixObject().setValue(context, MemberNames.ResetEmptyAssociations.toString(), resetemptyassociations);
	}

	/**
	 * @return value of Template_AdditionalProperties
	 */
	public final excelimporter.proxies.Template getTemplate_AdditionalProperties() throws com.mendix.core.CoreException
	{
		return getTemplate_AdditionalProperties(getContext());
	}

	/**
	 * @param context
	 * @return value of Template_AdditionalProperties
	 */
	public final excelimporter.proxies.Template getTemplate_AdditionalProperties(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		excelimporter.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Template_AdditionalProperties.toString());
		if (identifier != null)
			result = excelimporter.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Template_AdditionalProperties
	 * @param template_additionalproperties
	 */
	public final void setTemplate_AdditionalProperties(excelimporter.proxies.Template template_additionalproperties)
	{
		setTemplate_AdditionalProperties(getContext(), template_additionalproperties);
	}

	/**
	 * Set value of Template_AdditionalProperties
	 * @param context
	 * @param template_additionalproperties
	 */
	public final void setTemplate_AdditionalProperties(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.Template template_additionalproperties)
	{
		if (template_additionalproperties == null)
			getMendixObject().setValue(context, MemberNames.Template_AdditionalProperties.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Template_AdditionalProperties.toString(), template_additionalproperties.getMendixObject().getId());
	}

	/**
	 * @return value of AdditionalProperties_MxObjectMember_RemoveIndicator
	 */
	public final mxmodelreflection.proxies.MxObjectMember getAdditionalProperties_MxObjectMember_RemoveIndicator() throws com.mendix.core.CoreException
	{
		return getAdditionalProperties_MxObjectMember_RemoveIndicator(getContext());
	}

	/**
	 * @param context
	 * @return value of AdditionalProperties_MxObjectMember_RemoveIndicator
	 */
	public final mxmodelreflection.proxies.MxObjectMember getAdditionalProperties_MxObjectMember_RemoveIndicator(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AdditionalProperties_MxObjectMember_RemoveIndicator.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AdditionalProperties_MxObjectMember_RemoveIndicator
	 * @param additionalproperties_mxobjectmember_removeindicator
	 */
	public final void setAdditionalProperties_MxObjectMember_RemoveIndicator(mxmodelreflection.proxies.MxObjectMember additionalproperties_mxobjectmember_removeindicator)
	{
		setAdditionalProperties_MxObjectMember_RemoveIndicator(getContext(), additionalproperties_mxobjectmember_removeindicator);
	}

	/**
	 * Set value of AdditionalProperties_MxObjectMember_RemoveIndicator
	 * @param context
	 * @param additionalproperties_mxobjectmember_removeindicator
	 */
	public final void setAdditionalProperties_MxObjectMember_RemoveIndicator(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember additionalproperties_mxobjectmember_removeindicator)
	{
		if (additionalproperties_mxobjectmember_removeindicator == null)
			getMendixObject().setValue(context, MemberNames.AdditionalProperties_MxObjectMember_RemoveIndicator.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AdditionalProperties_MxObjectMember_RemoveIndicator.toString(), additionalproperties_mxobjectmember_removeindicator.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return additionalPropertiesMendixObject;
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
			final excelimporter.proxies.AdditionalProperties that = (excelimporter.proxies.AdditionalProperties) obj;
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
		return "ExcelImporter.AdditionalProperties";
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
