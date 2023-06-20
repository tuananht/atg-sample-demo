import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-execution-is-failing-on-starting-the-test-suite'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-execution-is-failing-on-starting-the-test-suite/30678')

'step 2: Add visual checkpoint at Page_t_test-execution-is-failing-on-starting-the-test-suite'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00780_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
