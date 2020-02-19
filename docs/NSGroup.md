# NSGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberCount** | **Long** | Count of the members added to this NSGroup |  [optional]
**members** | [**List&lt;NSGroupSimpleExpression&gt;**](NSGroupSimpleExpression.md) | Reference to the direct/static members of the NSGroup. Can be ID based expressions only. VirtualMachine cannot be added as a static member.  |  [optional]
**membershipCriteria** | [**List&lt;NSGroupExpression&gt;**](NSGroupExpression.md) | List of tag or name based expressions which define the dynamic membership criteria for this NSGroup. An object must satisfy atleast one of these expressions to qualify as a member of this group. It is not recommended to use ID based expressions in this section. ID based expression should be used in \&quot;members\&quot; section  |  [optional]
