import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_verify-element-not-clickable-fails-while-button-is-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/verify-element-not-clickable-fails-while-button-is-disabled/9460/3')

'step 2: Add visual checkpoint at Page_t_verify-element-not-clickable-fails-while-button-is-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01265_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
