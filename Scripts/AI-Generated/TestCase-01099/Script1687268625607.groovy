import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_new-release-introducing-gpt-powered-manual-test-generator-for-atlassian-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/new-release-introducing-gpt-powered-manual-test-generator-for-atlassian-jira/88539/6')

'step 2: Add visual checkpoint at Page_t_new-release-introducing-gpt-powered-manual-test-generator-for-atlassian-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01099_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
