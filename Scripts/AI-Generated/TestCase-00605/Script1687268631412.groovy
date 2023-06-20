import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-pass-the-element-in-object-repository-to-find-elements-code'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-pass-the-element-in-object-repository-to-find-elements-code/6288')

'step 2: Add visual checkpoint at Page_t_how-to-pass-the-element-in-object-repository-to-find-elements-code'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00605_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
