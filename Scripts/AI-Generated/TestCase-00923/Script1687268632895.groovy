import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_variable-in-xpath-is-not-working'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/variable-in-xpath-is-not-working/12912')

'step 2: Add visual checkpoint at Page_t_variable-in-xpath-is-not-working'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00923_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
