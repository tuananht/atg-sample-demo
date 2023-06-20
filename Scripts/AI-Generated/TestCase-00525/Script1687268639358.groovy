import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webui-verify-element-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webui-verify-element-clickable/16639/4')

'step 2: Add visual checkpoint at Page_t_webui-verify-element-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00525_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
