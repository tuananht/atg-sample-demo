import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_run-chrome-with-a-different-user-than-the-one-who-started-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/run-chrome-with-a-different-user-than-the-one-who-started-katalon/15421')

'step 2: Add visual checkpoint at Page_t_run-chrome-with-a-different-user-than-the-one-who-started-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00654_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
