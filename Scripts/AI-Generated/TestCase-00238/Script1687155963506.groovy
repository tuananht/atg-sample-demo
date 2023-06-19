import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_to-provide-current-date-and-timestamp-as-an-input-to-sendkeys-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/to-provide-current-date-and-timestamp-as-an-input-to-sendkeys-method/55161/3')

'step 2: Add visual checkpoint at Page_t_to-provide-current-date-and-timestamp-as-an-input-to-sendkeys-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00238_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
