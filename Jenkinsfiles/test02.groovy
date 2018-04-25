//----------------------------------------------------------------------------------------------------------------------
void slack_info(String state, String color, String postfix = null)
{
    notify_slack(params.slack_channel?.trim(), state, color, postfix)
}
//----------------------------------------------------------------------------------------------------------------------
void slack_error(String state, String color, String postfix = null)
{
    notify_slack(params.slack_error_channel?.trim(), state, color, postfix)
}
//----------------------------------------------------------------------------------------------------------------------
void notify_slack(String channel, String state, String color, String postfix = null)
{
    if (!channel)
    {
        echo "Slack channel is not set, skipping notification."
        return
    }

    message = "`${env.JOB_NAME}` <${env.BUILD_URL}|#${env.BUILD_NUMBER}> - ${state}\n"
    if (postfix)
        message += "\n" + postfix

    slackSend(channel: "${channel}", color: "${color}", message: "${message}")
}

return this
