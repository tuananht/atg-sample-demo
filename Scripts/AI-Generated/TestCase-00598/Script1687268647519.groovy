import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-trim-on-a-variable-for-settext-is-not-removing-the-trailing-space-in-the-variable'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-trim-on-a-variable-for-settext-is-not-removing-the-trailing-space-in-the-variable/39507')

'step 2: Add visual checkpoint at Page_t_using-trim-on-a-variable-for-settext-is-not-removing-the-trailing-space-in-the-variable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00598_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
