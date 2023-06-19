import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_easily-use-javascript-in-test-case'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/easily-use-javascript-in-test-case/7640')

'step 2: Add visual checkpoint at Page_t_easily-use-javascript-in-test-case'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00224_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
