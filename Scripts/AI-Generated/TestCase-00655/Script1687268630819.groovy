import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-resolve-class-internal-globalvariable-again'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-resolve-class-internal-globalvariable-again/23427')

'step 2: Add visual checkpoint at Page_t_unable-to-resolve-class-internal-globalvariable-again'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00655_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
