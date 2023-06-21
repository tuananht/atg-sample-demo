import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_value-from-clipboard-copied-link-to-be-assigned-to-groovy-variable'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/value-from-clipboard-copied-link-to-be-assigned-to-groovy-variable/83681')

'step 2: Add visual checkpoint at Page_t_value-from-clipboard-copied-link-to-be-assigned-to-groovy-variable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00221_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
