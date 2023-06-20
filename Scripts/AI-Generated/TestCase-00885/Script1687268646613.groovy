import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_live-walkthrough-create-execute-and-manage-test-scripts-on-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/live-walkthrough-create-execute-and-manage-test-scripts-on-katalon/87166')

'step 2: Add visual checkpoint at Page_t_live-walkthrough-create-execute-and-manage-test-scripts-on-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00885_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
