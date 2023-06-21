import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webui-how-can-i-open-a-new-tab-on-chrome'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webui-how-can-i-open-a-new-tab-on-chrome/5969')

'step 2: Add visual checkpoint at Page_t_webui-how-can-i-open-a-new-tab-on-chrome'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00223_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
