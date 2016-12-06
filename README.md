# Alexa 'Sounds Like' Custom Skill Using AWS Lambda Function.


## Description : 
This Alexa skill connects to the FreeSounds.org API and retrieve and plays sounds that you ask Alexa. 

## Usage 
**You** : *"Alexa, open Screw You!"* 

**Alexa** : *"You are piece of sh@t"*

**You** : *"Piss Off!"*
 
**Alexa** : *"Go f@ck yourself"*




## Setup
To run this skill you need to do two things. The first is to deploy this skill's code in lambda, and the second is to configure the Alexa skill to use Lambda. 

### AWS Lambda Setup
1. Go to the AWS Console and click on the Lambda link. Note: ensure you are in us-east or you wont be able to use Alexa with Lambda.
2. Click on the Create a Lambda Function or Get Started Now button.
3. Skip the blueprint
4. Name the Lambda Function "SoundsLike-Skill".
5. Select the runtime as Java 8
6. Go to the the skill/ directory containing pom.xml, and run `run.sh` script. This will generate a zip file named "soundslike-skill-bundle-1.0-jar-with-dependencies.jar" in the target directory.
7. Select Code entry type as "Upload a .ZIP file" and then upload the "soundslike-skill-bundle-1.0-jar-with-dependencies.jar" file from the build directory to Lambda
8. Set the Handler as soundslike.SoundsLikeSpeechletRequestStreamHandler (this refers to the Lambda RequestStreamHandler file in the zip).
9. Create a basic execution role and click create.
10. Leave the Advanced settings as the defaults.
11. Click "Next" and review the settings then click "Create Function"
12. Click the "Event Sources" tab and select "Add event source"
13. Set the Event Source type as Alexa Skills kit and Enable it now. Click Submit.
14. Copy the ARN from the top right to be used later in the Alexa Skill Setup.

### Alexa Skill Setup
1. Go to the [Alexa Console](https://developer.amazon.com/edw/home.html) and click Add a New Skill.
2. Set "Bad Words Skill" as the skill name and "screw you" as the invocation name, this is what is used to activate your skill. For example you would say: "Alexa, open screw you"
3. Select the Lambda ARN for the skill Endpoint and paste the ARN copied from above. Click Next.
4. Copy the custom slot types from the customSlotTypes folder. Each file in the folder represents a new custom slot type. The name of the file is the name of the custom slot type, and the values in the file are the values for the custom slot.
5. Copy the Intent Schema from the included IntentSchema.json.
6. Copy the Sample Utterances from the included SampleUtterances.txt. Click Next.
7. Go back to the skill Information tab and copy the appId. Paste the appId into the SoundsLikeSpeechlet.java file for the variable supportedApplicationIds,
   then update the lambda source zip file with this change and upload to lambda again, this step makes sure the lambda function only serves request from authorized source.
8. You are now able to start testing your sample skill! You should be able to go to the [Echo webpage](http://echo.amazon.com/#skills) and see your skill enabled.
9. In order to test it, try to say some of the Sample Utterances from the Examples section below.
10. Your skill is now saved and once you are finished testing you can continue to publish your skill.



## Disclaimer : 
This skill isn't appropriate for children and can be offensive to some people. This is just a joke and this skill will 
probably never ever get approved in their skill store. 
 
 
 
 
 
 

