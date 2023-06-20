import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_global-variable-that-calls-two-other-global-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/global-variable-that-calls-two-other-global-variables/55837/2')

'step 2: Add visual checkpoint at Page_t_global-variable-that-calls-two-other-global-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00730_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
