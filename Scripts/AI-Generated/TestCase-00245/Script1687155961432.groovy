import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webui-verify-element-13'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webui-verify-element-present/16622/13')

'step 2: Add visual checkpoint at Page_t_webui-verify-element-13'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00245_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
