import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-prevent-from-browser-closing-in-test-suite'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-prevent-from-browser-closing-in-test-suite/6462')

'step 2: Add visual checkpoint at Page_t_how-to-prevent-from-browser-closing-in-test-suite'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00235_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
