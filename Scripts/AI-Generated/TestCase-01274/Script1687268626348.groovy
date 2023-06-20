import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-it-possible-to-call-one-custom-keyword-function-from-another-custom-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-it-possible-to-call-one-custom-keyword-function-from-another-custom-keywords/11242/4')

'step 2: Add visual checkpoint at Page_t_is-it-possible-to-call-one-custom-keyword-function-from-another-custom-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01274_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
