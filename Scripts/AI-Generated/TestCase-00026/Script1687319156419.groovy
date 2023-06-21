import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-verify-element-text-contains-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-verify-element-text-contains-something/55698/2')

'step 2: Add visual checkpoint at Page_t_how-to-verify-element-text-contains-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00026_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
