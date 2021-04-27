//Validate a file
aws cloudformation validate-template --template-body  file://cf-role.yaml
################################################################################################################
################################################################################################################

Creating a stack 

// Creating a stack with parameters
aws cloudformation create-stack \
 --stack-name myteststack \
 --template-body file://sampletemplate.json /
 --parameters ParameterKey=KeyPairName,ParameterValue=TestKey ParameterKey=SubnetIDs,ParameterValue=SubnetID1\\,SubnetID2

// Creating IAM resources with capabilities
 aws cloudformation create-stack \
 --stack-name TestDatabsePolicy \
 --template-body file://cf-custom-managed-policy.yaml \
 --capabilities CAPABILITY_IAM

 aws cloudformation create-stack \
 --stack-name TestDatabseRole \
 --template-body file://cf-role.yaml \
 --capabilities CAPABILITY_IAM


CAPABILITY_IAM and CAPABILITY_NAMED_IAM
The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.

If you have IAM resources, you can specify either capability.

If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.
################################################################################################################
################################################################################################################


//Updating a stack 
aws cloudformation update-stack \
 --stack-name TestDatabsePolicy \
 --template-body file://cf-role.yaml \
 --capabilities CAPABILITY_IAM
################################################################################################################
################################################################################################################

Drift detection

aws cloudformation detect-stack-drift \
    --stack-name TestDatabsePolicy

aws describe-stack-resource-drifts
--stack-name TestDatabseRole

The resource drift status values to use as filters for the resource drift results returned.

DELETED : The resource differs from its expected template configuration in that the resource has been deleted.
MODIFIED : One or more resource properties differ from their expected template values.
IN_SYNC : The resources's actual configuration matches its expected template configuration.
NOT_CHECKED : AWS CloudFormation does not currently return this value.
################################################################################################################
################################################################################################################

 //Deleting a stack 
 aws cloudformation delete-stack \
    --stack-name TestDatabseRole

################################################################################################################
################################################################################################################
