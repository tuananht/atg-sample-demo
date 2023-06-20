import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_for-loop-access-looping-variable-as-string'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/for-loop-access-looping-variable-as-string/19917')

'step 2: Add visual checkpoint at Page_t_for-loop-access-looping-variable-as-string'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01048_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
