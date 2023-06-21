import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-it-possible-to-grab-the-numeric-value-from-a-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-it-possible-to-grab-the-numeric-value-from-a-field/28886/4')

'step 2: Add visual checkpoint at Page_t_is-it-possible-to-grab-the-numeric-value-from-a-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00146_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
