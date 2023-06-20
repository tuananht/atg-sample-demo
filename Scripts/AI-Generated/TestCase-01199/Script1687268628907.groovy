import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_why-is-katalon-studio-is-free-and-how-long-does-it-stay-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/why-is-katalon-studio-is-free-and-how-long-does-it-stay-free/6403/2')

'step 2: Add visual checkpoint at Page_t_why-is-katalon-studio-is-free-and-how-long-does-it-stay-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01199_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
