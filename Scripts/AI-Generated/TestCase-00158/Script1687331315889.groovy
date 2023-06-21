import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_storing-data-from-web-in-a-variable-and-use-same-data-as-input-within-the-same-script'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/storing-data-from-web-in-a-variable-and-use-same-data-as-input-within-the-same-script/11836')

'step 2: Add visual checkpoint at Page_t_storing-data-from-web-in-a-variable-and-use-same-data-as-input-within-the-same-script'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00158_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
