import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_validate-the-text-you-entered-set-sendkeys-before-submitting-form'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/validate-the-text-you-entered-set-sendkeys-before-submitting-form/12039')

'step 2: Add visual checkpoint at Page_t_validate-the-text-you-entered-set-sendkeys-before-submitting-form'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00866_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
