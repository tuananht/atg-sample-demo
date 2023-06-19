import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_javascript-to-send-text-to-a-field-with-10'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/javascript-to-send-text-to-a-field-with-xpath/26949/10')

'step 2: Add visual checkpoint at Page_t_javascript-to-send-text-to-a-field-with-10'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00242_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
