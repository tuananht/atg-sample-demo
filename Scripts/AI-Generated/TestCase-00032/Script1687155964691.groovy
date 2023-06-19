import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_tip-how-to-verify-element-style-properties'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/tip-how-to-verify-element-style-properties/36977')

'step 2: Add visual checkpoint at Page_t_tip-how-to-verify-element-style-properties'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00032_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
