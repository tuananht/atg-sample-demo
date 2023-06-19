import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_exception-element-not-9'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/exception-element-not-interactable/32451/9')

'step 2: Add visual checkpoint at Page_t_exception-element-not-9'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00253_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
