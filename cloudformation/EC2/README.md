Creating a basic EC2 instance using cloudformation 
    1. User data 
        update the os
        install mysql 
        install apache

    2. Define external parameters for the EC2 instance. 
        SSH key
        Environment
        Instance types
        Image Id from parameter store

    3.Define security groups for SSH and Web Access 
        Enable port 22 for 0.0.0.0/0
        Enable port 88 for 0.0.0.0/0

    4. Creating an EC2 instance profile with one inline policy and managed policy 
        Managed policy for S3ReadOnly access
        Inline policy  for ECR access 

    5. cfn-init and cfn-signal
    
    5. Output 
        Stack Name
        Public DNS
        Public IP