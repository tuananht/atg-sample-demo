import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_will-katalon-studio-support-other-scripting-languages-in-the-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/will-katalon-studio-support-other-scripting-languages-in-the-future/10968/3')

'step 2: Add visual checkpoint at Page_t_will-katalon-studio-support-other-scripting-languages-in-the-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00159_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
