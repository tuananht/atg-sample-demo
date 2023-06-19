import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_can-katalon-provide-a-method-to-decrypt-the-encrypted-string'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/can-katalon-provide-a-method-to-decrypt-the-encrypted-string/26725')

'step 2: Add visual checkpoint at Page_t_can-katalon-provide-a-method-to-decrypt-the-encrypted-string'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00071_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
