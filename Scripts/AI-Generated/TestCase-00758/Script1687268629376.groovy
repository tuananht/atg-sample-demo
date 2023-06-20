import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_video-is-empty-when-scenario-is-launched-by-katalon-runtime-trough-jenkins-windows-13'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/video-is-empty-when-scenario-is-launched-by-katalon-runtime-trough-jenkins-windows-instance/43974/13')

'step 2: Add visual checkpoint at Page_t_video-is-empty-when-scenario-is-launched-by-katalon-runtime-trough-jenkins-windows-13'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00758_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
