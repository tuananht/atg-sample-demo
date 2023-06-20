import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_verify-element-present-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/verify-element-present-false/32625/5')

'step 2: Add visual checkpoint at Page_t_verify-element-present-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00359_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
