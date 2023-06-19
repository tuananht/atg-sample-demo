import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-share-function-between-test-cases'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-share-function-between-test-cases/20015')

'step 2: Add visual checkpoint at Page_t_how-to-share-function-between-test-cases'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00077_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
