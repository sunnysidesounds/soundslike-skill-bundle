Alexa 'Sounds Like' Custom Skill Using AWS Lambda Function.
Description :

This Alexa skill connects to FreeSound.org and plays a sound from that API. 
Usage

User : "Alexa, open Sounds Like."

Alexa : "Ok, what sound would you like me to play for you?"

You : "Play me a sounds of a cat!"

Alexa : "Ok, here is a sounds of a cat 'AUDIOFILE' . Would you like to play another sound?"
Setup

To run this skill you need to do two things. The first is to deploy this skill's code in lambda, and the second is to configure the Alexa skill to use Lambda.
AWS Lambda Setup

    Go to the AWS Console and click on the Lambda link. Note: ensure you are in us-east or you wont be able to use Alexa with Lambda.
    Click on the Create a Lambda Function or Get Started Now button.
    Skip the blueprint
    Name the Lambda Function "SoundsLike-Skill".
    Select the runtime as Java 8
    Go to the the skill/ directory containing pom.xml, and run run.sh script. This will generate a zip file named "soundslike-skill-bundle-1.0-jar-with-dependencies.jar" in the target directory.
    Select Code entry type as "Upload a .ZIP file" and then upload the "soundslike-skill-bundle-1.0-jar-with-dependencies.jar" file from the build directory to Lambda
    Set the Handler as soundslike.SoundsLikeSpeechletRequestStreamHandler (this refers to the Lambda RequestStreamHandler file in the zip).
    Create a basic execution role and click create.
    Leave the Advanced settings as the defaults.
    Click "Next" and review the settings then click "Create Function"
    Click the "Event Sources" tab and select "Add event source"
    Set the Event Source type as Alexa Skills kit and Enable it now. Click Submit.
    Copy the ARN from the top right to be used later in the Alexa Skill Setup.

Alexa Skill Setup

    Go to the Alexa Console and click Add a New Skill.
    Set "Bad Words Skill" as the skill name and "screw you" as the invocation name, this is what is used to activate your skill. For example you would say: "Alexa, open screw you"
    Select the Lambda ARN for the skill Endpoint and paste the ARN copied from above. Click Next.
    Copy the custom slot types from the customSlotTypes folder. Each file in the folder represents a new custom slot type. The name of the file is the name of the custom slot type, and the values in the file are the values for the custom slot.
    Copy the Intent Schema from the included IntentSchema.json.
    Copy the Sample Utterances from the included SampleUtterances.txt. Click Next.
    Go back to the skill Information tab and copy the appId. Paste the appId into the SoundsLikeSpeechlet.java file for the variable supportedApplicationIds, then update the lambda source zip file with this change and upload to lambda again, this step makes sure the lambda function only serves request from authorized source.
    You are now able to start testing your sample skill! You should be able to go to the Echo webpage and see your skill enabled.
    In order to test it, try to say some of the Sample Utterances from the Examples section below.
    Your skill is now saved and once you are finished testing you can continue to publish your skill.

