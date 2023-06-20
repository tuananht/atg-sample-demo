import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_verifying-multiple-text-present-on-a-web-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/verifying-multiple-text-present-on-a-web-page/47513/5')

'step 2: Add visual checkpoint at Page_t_verifying-multiple-text-present-on-a-web-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01388_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
