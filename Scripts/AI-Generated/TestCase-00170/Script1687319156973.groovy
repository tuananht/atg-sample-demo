import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_ios-app-fails-to-launch-during-test-case-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/ios-app-fails-to-launch-during-test-case-recording/87152/2')

'step 2: Add visual checkpoint at Page_t_ios-app-fails-to-launch-during-test-case-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00170_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
