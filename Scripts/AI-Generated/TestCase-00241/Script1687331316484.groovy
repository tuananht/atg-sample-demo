import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-make-katalon-test-case-listen-to-javascript-console-log-from-chrome'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-make-katalon-test-case-listen-to-javascript-console-log-from-chrome/51048')

'step 2: Add visual checkpoint at Page_t_how-to-make-katalon-test-case-listen-to-javascript-console-log-from-chrome'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00241_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
