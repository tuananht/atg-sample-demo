import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-click-the-specific-id-i-need-to-click-the-button-with-javascript'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-click-the-specific-id-i-need-to-click-the-button-with-javascript/84319')

'step 2: Add visual checkpoint at Page_t_unable-to-click-the-specific-id-i-need-to-click-the-button-with-javascript'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00497_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
