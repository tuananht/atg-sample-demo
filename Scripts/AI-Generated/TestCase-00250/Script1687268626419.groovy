import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-loop-through-objects'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-loop-through-objects/9798')

'step 2: Add visual checkpoint at Page_t_how-to-loop-through-objects'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00250_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
